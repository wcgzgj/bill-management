<template>

    <a-layout-content style="padding: 0 50px">
      <a-breadcrumb style="margin: 16px 0"></a-breadcrumb>
      <a-layout style="padding: 24px 0; background: #fff">

        <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">

          <h1 style="font-size: 30px">账单列表</h1>

          类型:
          <a-select
                  v-model:value="bill.typeId"
                  style="width: 120px"
                  @focus="focus"
                  ref="select"
          >
            <!--这个信息，到时候要从数据库中动态获取-->
            <a-select-option value="0">全部</a-select-option>
            <a-select-option value="1">收入</a-select-option>
            <a-select-option value="2" >支出</a-select-option>
            <a-select-option value="3">借入</a-select-option>
            <a-select-option value="4">借出</a-select-option>
          </a-select>

          &nbsp;
          &nbsp;

          开始时间:
          <a-date-picker v-model:value="bill.startDate" placeholder="开始时间"/>

          &nbsp;
          &nbsp;
          结束时间:
          <a-date-picker v-model:value="bill.endDate" placeholder="结束时间"/>

          &nbsp;
          &nbsp;

          <a-button type="primary">查询</a-button>
          &nbsp;
          &nbsp;
          <a-button type="primary">重置</a-button>
          &nbsp;
          &nbsp;
          <a-button type="primary">
            <router-link to="/add">
              添加
            </router-link>
          </a-button>

          <br/>
          <br/>


          <a-table :columns="columns" :data-source="bills">
            <template #name="{ text }">
              <a>{{ text }}</a>
            </template>

            <template #action="{ record }">
              <span>
                <!--使用 router-link 跳转，带上参数-->
                <a-button type="primary" @click="toUpdate(record)">修改</a-button>
              </span>
              <span>
                <!--使用 restful 风格的删除-->
                <a-button type="danger" @click="showChangeScore(record)">删除</a-button>
              </span>
            </template>
          </a-table>

        </a-layout-content>
      </a-layout>
    </a-layout-content>


</template>

<script lang="ts">
import { defineComponent,ref } from 'vue';
import {Tool} from "@/util/Tool";
import { message } from 'ant-design-vue';
import {computed} from "@vue/reactivity";
import store from "@/store";
import axios from 'axios';
import {useRoute} from "vue-router";
import router from '../router';

const columns = [
  {
    title: '标题',
    dataIndex: 'name',
    key: 'name',
  },
  {
    title: '时间',
    dataIndex: 'email',
    key: 'email',
  },
  {
    title: '金额',
    dataIndex: 'score',
    key: 'score',
  },
  {
    title: '类别',
    key: 'action',
    dataIndex: 'score',
  },
  {
    title: '说明',
    key: 'action',
    dataIndex: 'score',
  },
  {
    title: '操作',
    key: 'action',
    slots: {
      customRender: 'action',
    },
  },
];

export default defineComponent({

  name: 'Home',


  setup() {

    const bill = ref({
      id:"",
      title:"",
      startDate:"",
      endDate:"",
      price:"",
      typeId:"0",
      explain:"", //说明
      // filePath:"",
      // fileName:""
    });

    const types = ref([]);



    return {
      columns,
      bill,
      types
    }
  },


});
</script>
