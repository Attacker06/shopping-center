package com.kai.shoppingmall.util;

import com.kai.shoppingmall.entity.Member;
import com.kai.shoppingmall.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class Runner implements CommandLineRunner {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {
        Member member = new Member();

    }

//    private String getRandomName(){
//        String lastName[] = {"趙","錢","孫","李","周","吳","鄭","王","馮","陳","褚","衛","蔣","沈","韓","楊","朱","秦","尤","許", "何","呂","施","張","孔","曹","嚴","華","金","魏","陶","姜","戚","謝","鄒","喻","柏","水","竇","章","雲","蘇","潘","葛","奚","範","彭","郎", "魯","韋","昌","馬","苗","鳳","花","方","俞","任","袁","柳","酆","鮑","史","唐","費","廉","岑","薛","雷","賀","倪","湯","滕","殷", "羅","畢","郝","鄔","安","常","樂","於","時","傅","皮","卞","齊","康","伍","餘","元","卜","顧","孟","平","黃","和", "穆","蕭","尹","姚","邵","湛","汪","祁","毛","禹","狄","米","貝","明","臧","計","伏","成","戴","談","宋","茅","龐","熊","紀","舒", "屈","項","祝","董","樑","杜","阮","藍","閔","席","季","麻","強","賈","路","婁","危","江","童","顏","郭","梅","盛","林","刁","鍾", "徐","邱","駱","高","夏","蔡","田","樊","胡","凌","霍","虞","萬","支","柯","昝","管","盧","莫","經","房","裘","繆","幹","解","應", "宗","丁","宣","賁","鄧","鬱","單","杭","洪","包","諸","左","石","崔","吉","鈕","龔","程","嵇","邢","滑","裴","陸","榮","翁","荀", "羊"};
//
//    }
}
