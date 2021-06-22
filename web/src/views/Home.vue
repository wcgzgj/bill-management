<template>

    <a-layout-content style="padding: 0 50px">
      <a-breadcrumb style="margin: 16px 0"></a-breadcrumb>
      <a-layout style="padding: 24px 0; background: #fff">

        <a-layout-content :style="{ padding: '0 24px', minHeight: '280px' }">

          <h1 style="font-size: 30px">账单列表</h1>
          <!--下面，是选择了该课程的所有学生的信息-->
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
import { defineComponent } from 'vue';

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

    return {
      columns
    }
  },


});
</script>
