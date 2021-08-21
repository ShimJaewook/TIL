# COUNT(*) 문제 해결



------

[CDS VIEW]

```
@AbapCatalog.sqlViewName: 'YTEST_SQLNAME01'
@AbapCatalog.compiler.compareFilter: true
@AbapCatalog.preserveKey: true
@AccessControl.authorizationCheck: #CHECK
@EndUserText.label: 'cds뷰 테스트'
define view YTEST_CDS_VIEW01 as 
select count(*) as count_all
from acdoca as a
inner join bseg as b
    on a.rbukrs = b.bukrs
    and a.gjahr  = b.gjahr
    and a.belnr  = b.belnr
    and a.buzei  = b.buzei
where a.rldnr = '0L'
and a.gjahr = '2020'
```

 

나

```
@AbapCatalog.sqlViewName: 'YTEST_SQLNAME01'
@AbapCatalog.compiler.compareFilter: true
@AbapCatalog.preserveKey: true
@AccessControl.authorizationCheck: #CHECK
@EndUserText.label: 'cds뷰 테스트'
define view YTEST_CDS_VIEW01 as 
select
from acdoca as a
inner join bseg as b
    on a.rbukrs = b.bukrs
    and a.gjahr  = b.gjahr
    and a.belnr  = b.belnr
    and a.buzei  = b.buzei{
    count(*) as count_all
}
where a.rldnr = '0L'
and a.gjahr = '2020'
```

 

로 작성하기

 

- from 절 후에 {}로 필드를 지정해주거나 select 뒤에 지정해주어야 함.
  - count(), sum(), max() 등 필드 외에 함수를 이용할 경우 as로 이름 지정해주어야 함.

 

[abap]

```
SELECT count_all
  INTO @cnt
  FROM ytest_cds_view01.
ENDSELECT.
```