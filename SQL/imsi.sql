delimiter $$

drop function if exists fn_get_age;

create function fn_get_age(born_date varchar(8)) returns int

begin

    declare born_year char(4);

    declare now_year char(4);

    declare age int;

    select date_format(now(),'%Y'), left(born_date,4)

    into now_year, born_year;

    select cast(now_year as int) - cast(born_year as int) + 1

    into age;

    return age;

end $$

delimiter ;



select date_format(now(),'%Y'), left("19960623",4)
into now_year, born_year;





-- - 값 삽입 후 commit 되게 처리

-- - 작성한 프로시저를 호출
delimiter $$
drop procedure if exists proc_INSERT_ORDER;
create procedure proc_INSERT_ORDER(
    in p_o_no int(10),
    in p_cus_no int(10),
    in p_o_price int(0)
)
begin

    start transaction;
        insert into t_order
        (o_no,cus_no,d_date,o_price)
        values
        (p_o_no,p_cus_no,now(),p_o_price);
    commit;
end $$
delimiter ;