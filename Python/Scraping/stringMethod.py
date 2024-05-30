from urllib.request import urlopen

url = "http://olympus.realpython.org/profiles/aphrodite"
page = urlopen(url)
html_bytes = page.read()
html = html_bytes.decode("utf-8")

# Extracting title
start_index = html.find("<title>") + len("<title>")
end_index = html.find("</title>")
print(html[start_index:end_index])


url = "https://www.instagram.com/cristiano/"
page = urlopen(url)
html_bytes = page.read()
html = html_bytes.decode("utf-8")
start_index = html.find("<title>") + len("<title>")
end_index = html.find("</title>")
print(html[start_index:end_index])
