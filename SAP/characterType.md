# Character Type

### character Type

- 데이타 타입 초기길이 가능길이초기값의미

1. Numeric Types I 4 4 0

2. Integer (whole number)

F

8

8

0

3. Floating point num er

P

8

1~16

0

 Packed num er

 Character Types

C

1

1~65535

' ... '

 Text Field (alphanumeric characters)

D

8

8

'00000000'

 Date field (Format: YYYYMMDD)

N

1

1~65536

'0 ... 0'

 Numeric text field (numeric characters)

T

6

6

'000000'

 Format:HHMMSS

 Hexadecimal Types

X

1

1~65535

X'0 ... 0'

 Hexadecimal field

 

 

- 사용형태

 Data Type

 TYPES dtype [TYPE type | LIKE dobj]

 Data Variable

 DATA var [TYPE type | LIKE dobj] 

 

- 사용예시

1. Predefined ABAP TYPE

  DATA : GV_NUM  TYPE  I,

            GV_DECI  TYPE  F,
    
            GV_DATE  TYPE  D,
    
            GV_TIME  TYPE  T,
    
            GV_TEXT1  TYPE  C,
    
            GV_TEXT2(2)  TYPE  C,
    
            GV_LONGTEXT  TYPE  STRING.

 



2. 프로그램의 Local Type을 이용하여 변수 선언 

* Local Type 선언

 TYPES : BEGIN  OF  T_STRUCT,

       COL1  TYPE  C,
    
       COL2  TYPE  I,
    
       COL3  TYPE  D,

  END  OF  T_STRUCT.

 

* Local Type을 이용하여 변수 선언

 DATA : GS_STRUCT  TYPE  T_STRUCT,

            GV_VAR  LIKE  GS_STRUCT-COL1.      

 



3. ABAP Dictionary의 Type을 이용하여 변수 선언

 DATA : GV_CARRID  TYPE  S_CARR_ID,

            GV_CONNID  TYPE  SFLIGHT-CARRID,
    
            GV_MATNR  TYPE  MARA-MATNR.

 



- Data 구문

1. TYPE

 DATA  GV_NUM1  TYPE  I.

 DATA  GV_NUM2  TYPE  I.

=>

     DATA : GV_NUM1  TYPE  I,
    
                GV_NUM2  TYPE  I.

 



2. LIKE => 먼저 만들어 놓은 DATA타입과 같은 타입의 변수를 만들 때 사용 

 DATA  GV_NUM1  TYPE  I.

 DATA  GV_NUM2  LIKE  GV_NUM1. 

 

3. VALUE => 초기값 지정 하는 옵션. 

 DATA : GV_NUM  TYPE  I  VALUE  123,

            GV_FLAG  VALUE  'X',
    
            GV_VAL  VALUE  IS  INITIAL,
    
            GV_IDX  LIKE  SY-TABIX  VALUE  45.

 



4. LENGTH => 필드 길이 지정. ( C, N, P, X 타입에만 사용 가능 ) 

 DATA : GV_NUM  TYPE  N  LENGTH  2.

 

5. DECIMALS => 1~14 사이의 소수 자리 수를 설정. ( P 타입에만 사용가능 ) 

 DATA : GV_NUM  TYPE  P  DECIMALS  3.