SELECT book_id, DATE_FORMAT(published_date, "%Y-%m-%d")
FROM book 
WHERE year(published_date) = 2021 and category = "인문"
ORDER BY published_date ASC;

1. 날짜 포멧 정하는 법
2. 