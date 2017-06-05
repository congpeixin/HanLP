/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/7 19:25</create-date>
 *
 * <copyright file="DemoChineseNameRecoginiton.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014+ 上海林原信息科技有限公司. All Right Reserved+ http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.HanLP;

import java.util.List;

/**
 * 关键词提取
 * @author hankcs
 */
    public class DemoKeyword
    {
        public static void main(String[] args)
        {
            String content = "海外网6月5日电 埃及、沙特、阿联酋、巴林政府声明与卡塔尔断交。\n" +
                "\n" +
                "据新华社，巴林政府5日宣布，鉴于卡塔尔干涉巴内政和支持在巴恐怖主义活动，巴与其断绝外交关系，召回巴驻卡塔尔外交人员，并要求卡塔尔驻巴外交人员48小时内离境，卡塔尔公民在14天之内离境。\n" +
                "\n" +
                "巴林在周一上午的声明中说，“（卡塔尔）在巴林传播公然违反国际法协议和原则的谣言，忽视了价值观、法律和道德，不考虑睦邻关系原则和对海湾关系的承诺。”\n" +
                "\n" +
                "据沙特通讯社，沙特将关闭与卡塔尔的航空、海域和陆地边境。\n" +
                "\n" +
                "据阿联酋国家通讯社消息，阿联酋5日宣布与卡塔尔断绝外交关系，指责后者破坏地区安全局势。\n" +
                "\n" +
                "此前，卡塔尔国家通讯社网站在当地时间5月24日凌晨遭黑客攻击，发布虚假言论。同时卡塔尔埃米尔塔米姆的社交媒体账号也被黑客攻击。黑客通过通讯社网站和埃米尔的社交媒体账号发布了与卡塔尔外交政策相悖的言论，称伊朗是重要的伊斯兰力量，卡塔尔同以色列关系密切，还批评美国在卡塔尔的军事存在。这一表态在中东媒体中引起强烈反应。\n" +
                "\n" +
                "卡塔尔通讯社推特账号随后还发文说，卡塔尔外交部要求将卡塔尔驻沙特、科威特、阿联酋、巴林等国大使召回国内，并同时驱逐这些国家驻卡塔尔的大使。\n" +
                "\n" +
                "卡塔尔国家通讯办公室主任赛义夫24日发表声明说，卡塔尔通讯社网站及其推特账号遭到黑客攻击，所播发的卡塔尔埃米尔（国家元首）塔米姆的讲话等报道是不正确的。\n" +
                "\n" +
                "自从卡塔尔半岛电视台和埃米尔推特事件发酵以后，沙特同卡塔尔的关系愈发紧张。尽管卡塔尔官方多次否认，但却未能阻止波斯湾阿拉伯国家之间不断扩大的裂痕。沙特媒体攻击卡塔尔，指责其“背叛”其他阿拉伯国家。\n" +
                "\n" +
                "沙特阿拉伯和阿拉伯联合酋长国也联合封锁了卡塔尔网站和广播公司。 卡塔尔外交部长穆罕默德·本·阿卜杜勒拉赫曼·阿勒萨尼(Mohammed bin Abdulrahman Al Thani)后来说，该国正成为“敌对媒体运动的目标”，我们将面临这一挑战。\n" +
                "\n" +
                "沙特、巴林、卡塔尔近年来也曾经产生龃龉。早在2014年，沙特阿拉伯、巴林与阿联酋表联合声明，宣布从召回各自驻卡塔尔大使，以抗议卡塔尔干涉海湾阿拉伯国家合作委员会(海合会)成员国内部事务。\n" +
                "\n" +
                "三国在联合声明中说，2013年11月，卡塔尔埃米尔塔米姆与沙特国王阿卜杜拉、科威特埃米尔萨巴赫在沙特首都利雅得签署海合会成员国之间互不干涉内政的协议。但是三个月过去，卡塔尔并未履行协议。（编译/孙蒙）";
            List<String> keywordList = HanLP.extractKeyword(content, 10);
            System.out.println(keywordList);
        }
}
