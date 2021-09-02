# 필드 카탈로그 뽑는 최신 코드

**[TOP 파일]**

TYPES : BEGIN OF ty_list.
TYPES : bukrs       TYPE zmm0930t_abs-bukrs,
    spmon       TYPE zmm0930t_abs-spmon,
    gubun       TYPE zmm0930t_abs-gubun,
    waers       TYPE zmm0930t_abs-waers,
    gubun_nm     TYPE char30,
    site       TYPE char10,
    tot_amt      TYPE zmm0930t_abs-tot_amt,
    tot_prev_s    TYPE icon_d,
    tot_prev     TYPE zmm0930t_abs-tot_prev,
    tot_m01m06    TYPE zmm0930t_abs-tot_m01m06,
    tot_m01m06_as   TYPE zmm0930t_abs-tot_m01m06_as,
    tot_m01m06_neg  TYPE zmm0930t_abs-tot_m01m06_neg,
    tot_m07m24    TYPE zmm0930t_abs-tot_m07m24,
    tot_m07m24_as   TYPE zmm0930t_abs-tot_m07m24_as,
    tot_m07m24_neg  TYPE zmm0930t_abs-tot_m07m24_neg,
    tot_m07m24_dis  TYPE zmm0930t_abs-tot_m07m24_dis,
    tot_m07m24_amt  TYPE zmm0930t_abs-tot_m07m24_amt,
    tot_m07m24_prev_s TYPE icon-id,
    tot_m07m24_prev  TYPE zmm0930t_abs-tot_m07m24_prev,
    up_reason     TYPE char10,
    down_reason    TYPE char10.
TYPES:  END OF ty_list.

 

\---

 

**[F 파일]**

DATA: lt_fieldcat TYPE slis_t_fieldcat_alv,
    ls_fieldcat TYPE slis_fieldcat_alv.

 DATA : lo_table TYPE REF TO cl_abap_tabledescr,
     lo_struc TYPE REF TO cl_abap_structdescr,
     lo_type TYPE REF TO cl_abap_datadescr.

 DATA : lt_struct_comp TYPE abap_component_tab,
     ls_struct_comp LIKE LINE OF lt_struct_comp.

 lo_struc ?= cl_abap_structdescr=>describe_by_name( 'TY_LIST' ).
 lt_struct_comp = lo_struc->get_components( ).
 lo_struc ?= cl_abap_structdescr=>create( p_components = lt_struct_comp ).

 DATA(lt_dfies) = cl_salv_data_descr=>read_structdescr( lo_struc ).

 gt_fieldcat = CORRESPONDING #( lt_dfies ).

 

\---

 

- TY_LIST는 꼭!! TYPES로 선언!! ALV에 보여줄 필드들만 담으면 됨