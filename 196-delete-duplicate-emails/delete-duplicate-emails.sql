DELETE FROM Person p1
USING PERSON p2
WHERE p1.email = p2.email
AND p1.id>p2.id