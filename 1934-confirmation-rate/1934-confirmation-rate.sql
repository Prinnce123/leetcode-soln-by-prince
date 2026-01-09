SELECT s.user_id,
      ifnull( ROUND(SUM(c.action = 'confirmed') / COUNT(c.user_id), 2),0) AS confirmation_rate
FROM Signups AS s
LEFT JOIN Confirmations AS c
       ON s.user_id = c.user_id
GROUP BY s.user_id;
