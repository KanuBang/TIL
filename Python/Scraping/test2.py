from bs4 import BeautifulSoup
from urllib.request import urlopen

html_text = urlopen("http://olympus.realpython.org/profiles").read().decode("utf-8")
soup = BeautifulSoup(html_text,"html.parser")

link_tags = soup.find_all("a")
for link in link_tags: 
    print("http://olympus.realpython.org/" + link["href"])