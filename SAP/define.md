# Define

---

Abap에서 메크로의 기능을 한다.

메크로라해서 어렵게 생각할거 없이 define 선언해준 부분의 코드를 사용하는 코드 부분에 **그대로** 가져다 쓴다고 보면 된다.

 코드의 재사용성을 높인다는 점에서 form이나 function과 비슷할 수 있지만 **&**로 받는 파라미터를 제외하면 코드를 그대로 쓴다는 점이 특징이다.

```abap
Form write_data USING p_data TYPE i.
	_%set_value : 'KOREA'.	
ENDFORM.

DEFINE _%set_value.
	p_data = &1.
END-OF-DEFINITION.	

```

위는 간단한 예시이다.

파라미터변수인 `p_data`가 DEFINE선언부에는 따로 선언하지 않아도 잘 값을 받아와서 적용시킨다. 

따로 매개변수를 주고받지 않고 DEFINE 부분이 사용한 코드 중간에 삽입하여 들어간다고 생각하면 쉽다. 

