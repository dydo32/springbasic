select * from KITRIEMP;
select * from KITRIDEPT;

select * from kitriemp 
where deptno in (select deptno from KITRIDEPT where deptname like '%¿µ¾÷%');
