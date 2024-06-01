import requests
from bs4 import BeautifulSoup
import pandas as pd

# URL of the Wikipedia page
url = "https://en.wikipedia.org/wiki/2023%E2%80%9324_Real_Betis_season"

# Send a request to fetch the HTML content of the page
response = requests.get(url)
html_content = response.content

# Parse the HTML content using BeautifulSoup
soup = BeautifulSoup(html_content, 'html.parser')

# Find the table that contains the players' list
players_table = soup.find('table', {'class': 'wikitable'})

# Extract the headers
headers = []
for th in players_table.find_all('th'):
    headers.append(th.text.strip())

# Extract the rows
rows = []
for tr in players_table.find_all('tr')[1:]:  # Skip the header row
    cells = tr.find_all(['td', 'th'])
    row = [cell.text.strip() for cell in cells]
    rows.append(row)

# Create a DataFrame
players_df = pd.DataFrame(rows, columns=headers)

# Display the DataFrame
print(players_df)

# Optionally, save the DataFrame to a CSV file
players_df.to_csv('real_betis_players_2023_24.csv', index=False)