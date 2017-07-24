/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/10 22:02</create-date>
 *
 * <copyright file="DemoCRFSegment.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014, 上海林原信息科技有限公司. All Right Reserved, http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.CRF.CRFSegment;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

import java.util.List;

/**
 * CRF分词(在最新训练的未压缩100MB模型下，能够取得较好的效果，可以投入生产环境)
 *
 * @author hankcs
 */
public class DemoCRFSegment
{
    public static void main(String[] args)
    {
        HanLP.Config.ShowTermNature = false;    // 关闭词性显示
        Segment segment = new CRFSegment().enableCustomDictionary(false);
        String[] sentenceArray = new String[]
                {
                    "编者按：随着《神偷奶爸 3》首映来袭，萌翻全世界的小黄人 Minions 再度席卷网络，成为今夏名副其实大 IP！都说「萌即正义」，这群爆萌小坏蛋名正言顺地刷了我们的屏！满屏都是小黄人的同时，你是否好奇小黄人到底有多「黄」、小黄人的「黄」有何与众不同？其实，小黄人的「黄」有一个好听的名字——Minion Yellow，它是由 Pantone ( 彩通 ) 和照明娱乐 ( Illumination Entertainment ) 与环球影业 ( Universal Partnerships & Licensing ) 合作推出的彩通官方颜色。SocialBeta 曾专访过这家以研究色彩而闻名全球的权威公司 Pantone ( 彩通 )，一同聊了聊它是如何制定年度代表色、年度代表色背后蕴含怎样的逻辑和思考。就 Pantone 现在提供的服务而言，它为市场产品提供色卡,每年 Pantone 及其遍布全球 100 多个国家的特许经营商户为众多领域如制图艺术、印刷出版、家居服装、塑料品、建筑、油漆材料、工业设计和消费者市场提供产品和服务。关于 Pantone 的授权商品服务内容，他们有一个 Pantone Universe，这是一个生活风格产品系列，产品包括文具、旅行用品、配件、雨衣等。此外，Pantone ( 彩通 ) 还为品牌提供色彩咨询服务，在我们熟悉的品牌中，Pantone ( 彩通 ) 就曾向可口可乐、蒂凡尼、星巴克等品牌提供过品牌色彩咨询服务。在本次与电影《神偷奶爸》的合作中，Pantone 的色彩研究所也为小黄人提供了配色解决方案。参考阅读：【SocialBeta 专访】年度流行色是如何推出的？我们和这家决定色彩规则的公司聊了聊 本文系Pantone授权SocialBeta发布，未经许可，不得转载 该款颜色来源于环球影业与照明娱乐联合制作的《神偷奶爸》（Despicable Me）系列主要角色小黄人，也是大热电影《小黄人大眼萌》的主角。Minion Yellow 是彩通有史以来第一次以电影角色为依据发布的色彩！让彩通为小黄人推出专属颜色其实是《神偷奶爸》（Despicable Me）系列的御用音乐制作人法瑞尔·威廉姆斯（Pharrell Williams）的主意。同时，专注提供色彩咨询、研究全球色彩趋势与色彩对人类影响的彩通色彩研究所™（Pantone Color Institute™）也发现：消费者们迫切需要生活中多一些活泼的颜色。彩通发现，照明娱乐的小黄人形象仅凭大热电影、主题公园和电子游戏已火爆全球。于是，正在为彩通®服装，家居+室内装潢色彩 （PANTONE® Fashion, Home + Interiors color palette）搜寻更多色彩的彩通赶紧与照明娱乐的动画团队合作，回顾已有色域，终于找到最能代表小黄人的「黄」—— 外向、顽皮又温暖的 Minion Yellow，引人好奇，点亮心情。彩通®色彩研究所（Pantone Color Institute™）副总裁 Laurie Pressman 接受了一段简短采访，与我们分享了更多她对于这次史无前例的合作的洞察。问：是什么让彩通、照明娱乐和环球影业会走到一起，创造了 Pantone Minion Yellow 色？Laurie：《小黄人大眼萌》是一部在全球都属现象级的大电影。Pantone、照明娱乐和环球影业的合作是一场设计专业者的聚会，我们都认可小黄人在流行文化中的地位，也都想要合作为这个标志性的形象定制它们自己的颜色。问：为什么对于照明娱乐和环球影业来说，小黄人们需要自己独特的颜色？Laurie：我们被色彩包围，色彩所带来的视觉感受定义着我们的世界，色彩把我们与环境和所有我们热爱的东西联系在一起。色彩可以作为一种信号，一种标识。它指挥着我们的注意力，并能建立即时的联系。为小黄人量身定做一款黄色可以保证不管你身处何处，都能通过这款鲜明的颜色一眼认出这个角色。问： Pantone Minion Yellow 色的灵感来源哪里？你会如何定义这款颜色？Laurie：彩通色彩研究所团队的灵感直接取自小黄人的角色本身，我们的团队与照明娱乐的动画团队一起决定了这款最能体现小黄人的黄色。Pantone Minion Yellow 专为代表这些可爱的「坏」东西设计。明亮、充满活力、友好、顽皮，这是一款外向、俏皮、温暖又活泼的黄色。这款颜色的活力完美捕捉了小黄人的灵魂，将这个独创角色的真正内核展露无遗。扫描二维码关注 Pantone 官方公众号，关注 Pantone 官方微博（ID: PANTONE彩通），了解更多色彩资讯。"
                };
        for (String sentence : sentenceArray)
        {
            List<Term> termList = segment.seg(sentence);
            System.out.println(termList);
        }

        /**
         * 内存CookBook:
         * HanLP内部有智能的内存池，对于同一个CRF模型（模型文件路径作为id区分），只要它没被释放或者内存充足，就不会重新加载。
         */
        for (int i = 0; i < 5; ++i)
        {
            segment = new CRFSegment();
        }
    }
}
