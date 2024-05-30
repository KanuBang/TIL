import re
from urllib.request import urlopen
'''
the asterisk character (*) stands for zero or more instances of
whatever comes just before the asterisk.

Literal Characters:

Regular Expression: ab*c
Matches: ac, abc, abbc, abbbc, etc.
Explanation: The character b can appear zero or more times between a and c.
'''

print(re.findall("a*bc", "abc"))
print(re.findall("a*bc", "bbc"))
print(re.findall("a*bc", "knc"))
print(re.findall("ab*c", "ABC"))
print(re.findall("ab*c", "ABbbbbbC", re.IGNORECASE))

'''
In regular expressions, a dot (.) is a special character 
that matches any single character except for a newline character. 
It is a wildcard character that can be used to represent any character in a string.
Examples:
Basic Usage:
Regular Expression: a.c
Matches: abc, a1c, a-c, etc.
Explanation: The dot matches any single character between a and c.
'''
print("_" * 50)
print(re.findall("a.c", "abc"))
print(re.findall("a.c", "ac"))
print(re.findall("a.c","abbc"))
print(re.findall("a.c", "acc"))

'''
Combined (.*):
When combined, .* matches zero or more of any character (except a newline). 
This means it can match any sequence of characters, including an empty sequence.

Examples:
Basic Matching:

Regular Expression: a.*b
Matches: ab, aXb, a123b, aXYZb, a b, etc.
Explanation: Matches any sequence of characters (or none) between a and b.

'''
print("-" * 50)
print(re.findall("a.*c","artrtrc"))
print(re.findall("a.*c","ac"))

#search
print("_" * 50)
match_result = re.search("ab*c","ABC", re.IGNORECASE)
print(match_result.group())

#sub: non-greedy matching
string = "Everything is <replaced> if it's in <tags>."
string = re.sub("<.*?>", "RONALDO", string)
print(string)

#extract
url = "http://olympus.realpython.org/profiles/dionysus"
page = urlopen(url)
html = page.read().decode("utf-8")
print(html)

pattern = "<title.*?>.*?</title.*?>"
match_result = re.search(pattern,html,re.IGNORECASE)
title = match_result.group()
title = re.sub("<.*?>", "", title)

print(title)