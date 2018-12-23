/*
<script>
/!*import '../../../assets/css/commlist.css'
import '../../../assets/css/comm.sass'
import '../../../assets/css/commscoped.sass'*!/

export default {
    data () {
        return {
            tableData: [{
                rowNum: 1,
                address: '西安城墙',
                name: '小哥',
                weather: '下雪',
                phone: '0771-5201314',
                date: '2016-11-22',
                mdate: '2018-04-10',
                loveer: '甜甜圈'
            }, {
                rowNum: 2,
                address: '西安城墙',
                name: '小哥',
                weather: '下雪',
                phone: '0771-5201314',
                date: '2016-11-22',
                mdate: '2018-04-10',
                loveer: '甜甜圈'
            }, {
                rowNum: 3,
                address: '西安城墙',
                name: '小哥',
                weather: '下雪',
                phone: '0771-5201314',
                date: '2016-11-22',
                mdate: '2018-04-10',
                loveer: '甜甜圈'
            }, {
                rowNum: 4,
                address: '西安城墙',
                name: '小哥',
                weather: '下雪',
                phone: '0771-5201314',
                date: '2016-11-22',
                mdate: '2018-04-10',
                loveer: '甜甜圈'
            }, {
                rowNum: 5,
                address: '西安城墙',
                name: '小哥',
                weather: '下雪',
                phone: '0771-5201314',
                date: '2016-11-22',
                mdate: '2018-04-10',
                loveer: '甜甜圈'
            }],
            selectlistRow: []
        }
    },
    methods: {
        // 获取表格选中时的数据
        selectRow (val) {
            this.selectlistRow = val
        },
        // 增加行
        addRow () {
            var list = {
                rowNum: '',
                address: this.address,
                name: this.name,
                weather: this.weather,
                phone: this.phone,
                date: this.date,
                mdate: this.mdate,
                loveer: this.loveer}
            this.tableData.unshift(list)
        },
        // 删除方法
        // 删除选中行
        delData () {
            for (let i = 0; i < this.selectlistRow.length; i++) {
                let val = this.selectlistRow
                // 获取选中行的索引的方法
                // 遍历表格中tableData数据和选中的val数据，比较它们的rowNum,相等则输出选中行的索引
                // rowNum的作用主要是为了让每一行有一个唯一的数据，方便比较，可以根据个人的开发需求从后台传入特定的数据
                val.forEach((val, index) => {
                    this.tableData.forEach((v, i) => {
                    if (val.rowNum === v.rowNum) {
                    // i 为选中的索引
                    this.tableData.splice(i, 1)
                }
            })
            })
            }
            // 删除完数据之后清除勾选框
            this.$refs.tableData.clearSelection()
        }
    }
}
</script>
*/
