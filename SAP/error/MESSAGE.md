# MESSAGE로 '보호된 탭 제목은 지원되지 않습니다 (탭 TAB_C 제목 TAB1)'

---

```ABAP
LOOP AT SCREEN,
 IF SCREEN-GROUP = 'MOF'.
    SCREEN-INPUT = 0.
 ENDIF.
MODIFY SCREEN.
ENDLOOP.
```

LOOP AT SCREEN에서 발생하는 오류.

 

INPUT=0(비활성화) 할 수 없는 필드까지 설정하는 경우 발생하는 것으로 보임.

 

GROUP을 정확히 비활성화하고 싶은 필드에만 걸어주면 안남.