# ALV 소계 합계 기능



**[SORT]**

DATA : ls_sort LIKE LINE OF pt_sort.

 CLEAR : ls_sort.
 ls_sort-spos = 2.
 ls_sort-fieldname = 'GUBUN_NM'. " 소계할 기준 필드 추가
\* ls_sort-up    = abap_true.
 ls_sort-down   = abap_true.
 ls_sort-subtot    = 'X'. " 소계 기능 추가

```ABAP
**[ FIELDCATALOG]**

LOOP AT gt_fieldcat INTO gs_fieldcat.

  CASE gs_fieldcat-fieldname.
   WHEN 'GUBUN_NM'.
    gs_fieldcat-coltext =  TEXT-t05.
   WHEN 'SITE'.
    gs_fieldcat-coltext =  TEXT-t06.
   WHEN 'TOT_AMT'.
    gs_fieldcat-coltext =  TEXT-t07.
    gs_fieldcat-do_sum =  'X'.  " 소계를 하고 싶은 필드에 do_sum 표시! 총계도 자동으로 나오게 됨.
   WHEN 'TOT_PREV_S'.
    gs_fieldcat-coltext =  TEXT-t08.
   WHEN 'TOT_PREV'.
    gs_fieldcat-coltext =  TEXT-t09.
    gs_fieldcat-do_sum =  'X'. " 소계를 하고 싶은 필드에 do_sum 표시
   WHEN 'TOT_M01M06'.
    gs_fieldcat-coltext =  TEXT-t10.
    gs_fieldcat-do_sum =  'X'. " 소계를 하고 싶은 필드에 do_sum 표시
   WHEN 'TOT_M01M06_AS'.
    gs_fieldcat-coltext =  TEXT-t11.
    gs_fieldcat-do_sum =  'X'. " 소계를 하고 싶은 필드에 do_sum 표시

ENDLOOP.



" [LAYOUT]

ps_layout-no_totline = 'X'. "소계만 구하고 총계는 원하지 않을 때


```



