import re
from urllib.request import urlopen

url = "http://olympus.realpython.org/profiles/dionysus"
html = urlopen(url).read().decode("utf-8")
print(html)

pattern = "<br>.*?<br>"
match_result =re.findall(pattern, html)
print(match_result)