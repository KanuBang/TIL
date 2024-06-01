from bs4 import BeautifulSoup 
from urllib.request import urlopen

url = "http://olympus.realpython.org/profiles/dionysus"
page = urlopen(url)
html = page.read().decode("utf-8")
soup = BeautifulSoup(html, "html.parser")
print("_"*50)
print(soup.get_text().replace('\n', ''))
print(soup.find_all("img"))

image1, image2 = soup.find_all("img")
print("_"*50)
print(image1.name)
print(image2["src"])

print("_"*50)
print(soup.title)
print(soup.title.string)

print("_"*50)
print(soup.find_all("img", src="/static/dionysus.jpg"))