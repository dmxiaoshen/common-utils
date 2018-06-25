package com.dmxiaoshen.common.utils;

import com.fasterxml.jackson.databind.JsonNode;
import net.sf.json.JSONObject;

import java.util.Map;
import java.util.UUID;

/**
 * Created by hzhsg on 2018/6/8.
 */
public class IdGenUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"gjj_brief\": {\n" +
                "        \"gjj_sid\": \"3956709\", \n" +
                "        \"name\": \"全小琴\", \n" +
                "        \"ID\": \"420624199409284321\", \n" +
                "        \"location_cid\": \"1\", \n" +
                "        \"card\": \"\", \n" +
                "        \"customer_id\": \"100178333300\", \n" +
                "        \"balance\": \"15840.00\", \n" +
                "        \"fb_balance\": \"0.00\", \n" +
                "        \"once_balance\": \"0.00\", \n" +
                "        \"deposit_amount\": \"1440.00\", \n" +
                "        \"fb_deposit_amount\": \"0.00\", \n" +
                "        \"record_date\": \"0000-00-00\", \n" +
                "        \"status\": \"正常\", \n" +
                "        \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "        \"deposit_base\": \"6000.00\", \n" +
                "        \"init_date\": \"0000-00-00\", \n" +
                "        \"start_date\": \"0000-00-00\", \n" +
                "        \"person_rate\": \"12\", \n" +
                "        \"company_rate\": \"12\", \n" +
                "        \"gender\": \"女\", \n" +
                "        \"email\": \"\", \n" +
                "        \"phone\": \"135****2821\", \n" +
                "        \"marriage\": \"\", \n" +
                "        \"address\": \"\", \n" +
                "        \"birthday\": \"1994-09-28\", \n" +
                "        \"company_id\": \"\", \n" +
                "        \"person_deposit_amount\": \"720.00\", \n" +
                "        \"company_deposit_amount\": \"720.00\", \n" +
                "        \"deposit_rate\": \"24\", \n" +
                "        \"location\": \"杭州\"\n" +
                "    }, \n" +
                "    \"gjj_brief_analysis\": {\n" +
                "        \"cont_last_times\": \"-1\", \n" +
                "        \"consis_months\": \"-1\", \n" +
                "        \"sum_times\": \"-1\", \n" +
                "        \"exist_months\": \"-1\", \n" +
                "        \"deposit_amount_analysis\": \"0.00\", \n" +
                "        \"balance_analysis\": \"0.00\", \n" +
                "        \"platform_updated_time\": \"2018-06-20 11:17:13\", \n" +
                "        \"deposit_base_analysis\": \"0.00\", \n" +
                "        \"platform_create_time\": \"2017-10-16 11:39:25\", \n" +
                "        \"province\": \"浙江省\", \n" +
                "        \"city\": \"杭州\", \n" +
                "        \"location_all\": \"杭州市公积金\", \n" +
                "        \"deposit_rate_analysis\": \"12\", \n" +
                "        \"platform_refresh_time\": \"1529464633\", \n" +
                "        \"record_date_analysis\": \"2018-05-22\", \n" +
                "        \"gjj_status_analysis\": true\n" +
                "    }, \n" +
                "    \"gjj_detail\": [\n" +
                "        {\n" +
                "            \"sid\": \"39279\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2017-03-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201703\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"24000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39280\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2017-02-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201702\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"23000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39281\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2017-01-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201701\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"22000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39282\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-12-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201612\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"21000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39283\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-11-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201611\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"20000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39284\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-10-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201610\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"19000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39285\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-09-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201609\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"18000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39286\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-08-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201608\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"17000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39287\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-07-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201607\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"16000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39288\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-06-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201606\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"15000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39289\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-05-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201605\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"14000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39290\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-04-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201604\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"13000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39291\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-03-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201603\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"12000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39292\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-02-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201602\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"11000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39293\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-01-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201601\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"10000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39294\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2015-12-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201512\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"9000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39295\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2015-11-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201511\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"8000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39296\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2015-10-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201510\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"7000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39297\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2015-09-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201509\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"6000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39298\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2015-08-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201508\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"5000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39299\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2015-07-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201507\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"4000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39300\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2015-06-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201506\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"3000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39301\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2015-05-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201505\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"2000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39302\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2015-04-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201504\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"1000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39303\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-06-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201606\", \n" +
                "            \"amount\": \"200.00\", \n" +
                "            \"balance\": \"1200.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39304\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2016-06-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201606\", \n" +
                "            \"amount\": \"300.00\", \n" +
                "            \"balance\": \"1200.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39305\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2017-04-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201704\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"24000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39306\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2017-05-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201705\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"24000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39307\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2017-06-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201706\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"24000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"39308\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": null, \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"杭州煎饼网络技术有限公司\", \n" +
                "            \"record_date\": \"2017-07-17\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"201707\", \n" +
                "            \"amount\": \"1000.00\", \n" +
                "            \"balance\": \"24000.00\", \n" +
                "            \"std_op_type\": null, \n" +
                "            \"created_time\": \"2017-10-16 11:39:25\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72890\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2018-05-22\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"15840.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72891\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2018-04-24\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"14400.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72892\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2018-03-22\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"12960.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72893\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2018-02-23\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"11520.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72894\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2018-01-23\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"10080.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72895\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2017-12-22\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"8640.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72896\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2017-11-22\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"7200.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72897\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2017-10-24\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"5760.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72898\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2017-09-22\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"4320.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72899\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2017-08-22\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"2880.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }, \n" +
                "        {\n" +
                "            \"sid\": \"72900\", \n" +
                "            \"gjj_sid\": \"3956709\", \n" +
                "            \"order_id\": \"0\", \n" +
                "            \"gjj_type\": \"0\", \n" +
                "            \"company\": \"\", \n" +
                "            \"record_date\": \"2017-07-25\", \n" +
                "            \"op_type\": \"汇缴\", \n" +
                "            \"record_month\": \"\", \n" +
                "            \"amount\": \"1440.00\", \n" +
                "            \"balance\": \"1440.00\", \n" +
                "            \"std_op_type\": \"汇缴\", \n" +
                "            \"created_time\": \"2018-06-01 18:01:33\"\n" +
                "        }\n" +
                "    ], \n" +
                "    \"gjj_detail_analysis\": {\n" +
                "        \"company_6m_arr\": [ ], \n" +
                "        \"company_12m_arr\": [\n" +
                "            \"杭州煎饼网络技术有限公司\"\n" +
                "        ], \n" +
                "        \"company_24m_arr\": [\n" +
                "            \"杭州煎饼网络技术有限公司\"\n" +
                "        ], \n" +
                "        \"created_date_arr\": [\n" +
                "            \"2017-10-16\", \n" +
                "            \"2018-06-01\"\n" +
                "        ], \n" +
                "        \"detail_init_record_date\": \"2015-04-17\", \n" +
                "        \"detail_init_record_month\": \"201504\", \n" +
                "        \"detail_init_create_time\": \"2017-10-16 11:39:25\", \n" +
                "        \"detail_latest_record_date\": \"2018-05-22\", \n" +
                "        \"detail_latest_record_month\": \"201707\", \n" +
                "        \"detail_latest_create_time\": \"2018-06-01 18:01:33\", \n" +
                "        \"detail_times\": 2, \n" +
                "        \"company_count_6m_analysis\": 1, \n" +
                "        \"company_count_12m_analysis\": 1, \n" +
                "        \"company_count_24m_analysis\": 1, \n" +
                "        \"company_analyzed_data\": [ ]\n" +
                "    }, \n" +
                "    \"gjj_loan_brief\": [ ], \n" +
                "    \"gjj_loan_brief_analysis\": [ ], \n" +
                "    \"gjj_loan_detail\": [ ], \n" +
                "    \"gjj_user\": {\n" +
                "        \"user_name\": \"全小琴\", \n" +
                "        \"user_ID\": \"420624199409284321\", \n" +
                "        \"user_gjj_create_time\": \"2017-10-16 11:39:25\", \n" +
                "        \"user_gjj_refresh_time\": \"2018-06-20 11:17:13\", \n" +
                "        \"user_gender\": \"女\", \n" +
                "        \"user_birthday\": \"1994-09-28\"\n" +
                "    }, \n" +
                "    \"r\": \"ok\"\n" +
                "}";


        JSONObject jsonObject = JSONObject.fromObject(json);
        System.out.println(jsonObject.toString());
        JsonNode jsonNode = JacksonUtils.toJsonNode(jsonObject.toString());
        Map<String,Object> result = JacksonUtils.toJavaBean(jsonObject.toString(),Map.class);
//        System.out.println("----------------------"+jsonNode.size());
//        System.out.println(JacksonUtils.toJson(jsonNode));
        System.out.println("---------"+result.size());
        System.out.println(JacksonUtils.toJson(result));
    }
}
