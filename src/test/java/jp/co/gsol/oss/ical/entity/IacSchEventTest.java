/*
 * Copyright 2013-2014 Global Solutions Co., Ltd.
 * All rights reserved.
 */

package jp.co.gsol.oss.ical.entity;

import javax.annotation.Generated;
import org.junit.runner.RunWith;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.TestContext;

import static jp.co.gsol.oss.ical.entity.IacSchEventNames.*;

/**
 * {@link IacSchEvent}のテストクラスです。
 * 
 * @author Global Solutions Co., Ltd.
 */
@RunWith(Seasar2.class)
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2014/01/08 16:13:48")
public class IacSchEventTest {

    private TestContext testContext;

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    public void before() throws Exception {
        testContext.setAutoIncluding(false);
        testContext.include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(IacSchEvent.class).id("aaa").getSingleResult();
    }

    /**
     * iacSchEventParticipantListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_iacSchEventParticipantList() throws Exception {
        jdbcManager.from(IacSchEvent.class).leftOuterJoin(iacSchEventParticipantList()).id("aaa").getSingleResult();
    }
}