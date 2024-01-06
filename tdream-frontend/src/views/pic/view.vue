<template>
  <el-card class="layout-preview">
    <el-row>
      <el-col :span="12">
        <el-input placeholder="请输入图片转移路径" />
      </el-col>
    </el-row>
  </el-card>
  <el-card class="layout-preview">
    <!-- 图片预览 -->
    <el-space>
      
    </el-space>
    <el-row>
      <!-- 循环展示 -->
      <el-space wrap :size="10">
      </el-space>
      <el-col :span="6" v-for="i in 5" :key="i">
        <el-space wrap :size="10">
          <el-image
              style="width: 100%;"
              src="https://pic.teexue.com/vPmqEc.png"
              fit="cover"
              lazy
              :zoom-rate="1.2"
              :max-scale="7"
              :min-scale="0.2"
              :preview-src-list="srcList"
              :initial-index="4"
          />
          <el-button @click="drawer = true">查看详细信息</el-button>
        </el-space>
      </el-col>
    </el-row>
  </el-card>
  <el-drawer
    title="详细信息"
    v-model="drawer"
    :direction="direction"
    :destroy-on-close="true"
  >
    <span>名称:</span><span>{{srcpic.name}}</span><br/>
    <span>描述:</span><span>{{srcpic.desc}}</span><br/>
    <span>标签:</span><span>{{srcpic.tag}}</span><br/>
    <span>分类:</span><span>{{srcpic.category}}</span><br/>
    <span>作者:</span><span>{{srcpic.author}}</span><br/>
    <span>大小:</span><span>{{srcpic.size}}</span><br/>
    <span>分辨率:</span><span>{{srcpic.resolution}}</span><br/>
    <span>上传时间:</span><span>{{srcpic.uploadTime}}</span><br/>
  </el-drawer>
</template>

<style scoped>
.layout-preview {
  line-height: 2;
  font-size: 15px;
}

.layout-preview h2 {
  margin: 6px 0;
}
</style>
<script setup lang="ts">
import { ref } from 'vue';

const srcList = [
  'https://pic.teexue.com/vPmqEc.png',
  'https://pic.teexue.com/vPmqEc.png',
]
const srcpic = {
  name: 'vPmqEc.png',
  desc: '这是一张图片',
  tag: '图片',
  category: '图片',
  author: 'liuzd',
  size: '100kb',
  resolution: '1920*1080',
  uploadTime: '2021-08-01 12:00:00'
}
const direction = 'rtl'
const drawer = ref(false)
</script>