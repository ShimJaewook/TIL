# Structure의 column을 Index로 접근하기

---

```abap
TYPES : BEGIN OF ty_list,
          col1 TYPE i,
          col2 TYPE i,
          col3 TYPE i,
        END OF ty_list.
DATA : ls_list TYPE ty_list.
FIELD-SYMBOLS: <column> TYPE any.

ls_list-col1 = 1.
ls_list-col2 = 2.
ls_list-col3 = 3.

" ASSIGN COMPONENT 인덱스 of STRUCTURE 스트럭처 to 필드심볼
ASSIGN COMPONENT 1 of STRUCTURE ls_list to <column>. " 1
ASSIGN COMPONENT 2 of STRUCTURE ls_list to <column>. " 2
ASSIGN COMPONENT 3 of STRUCTURE ls_list to <column>. " 3
```

