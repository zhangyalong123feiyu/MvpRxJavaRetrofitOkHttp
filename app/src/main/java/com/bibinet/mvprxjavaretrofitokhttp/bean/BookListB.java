package com.bibinet.mvprxjavaretrofitokhttp.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by bibinet on 2017-5-26.
 */

public class BookListB implements Serializable {

    /**
     * error_code : 200
     * reason : 请求成功！
     * result : {"total":6,"limit":20,"bookList":[{"name":"萌系少女漫画家","type":"少年漫画","area":"日本漫画","des":"萌系少女漫画家漫画 ，姬咲桃华－１６岁，是个内向又非常喜欢少女漫画的女高中生。明明想画的是少女漫画，却因为发生了偶然的意外而开始画起了萌系漫画。咦咦\u2026！？萌是什麽东西啊？？我搞不懂啦！而桃华所暗恋的同班同学五十岚臣又有著什麽样的秘密？不管是谈恋爱、钻研漫画还是追寻萌！一切都没有捷径，只能不断地摸索的迷航物语\u2026现在开幕！欢迎在新动漫漫画网观看萌系少女漫画家漫画","finish":false,"lastUpdate":20141114,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b87e38f275fd560ae949.jpg"},{"name":"莎梅少女漫画教室","type":"少年漫画","area":"日本漫画","des":"曾莎梅的少女漫画教程,喜欢画少女漫的值得看下(本漫画内容介绍由xindm.cn整理提供)","finish":true,"lastUpdate":20120725,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b8d838f275fd560b0566.jpg"},{"name":"少女漫画家之恋","type":"少女漫画","area":"日本漫画","des":"少女漫画家之恋漫画 ，少女漫画家与英俊编辑的故事欢迎在新动漫漫画网观看少女漫画家之恋漫画","finish":true,"lastUpdate":20141106,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b94638f275fd560b1739.jpg"},{"name":"少女漫画什么的最讨厌了","type":"少女漫画","area":"日本漫画","des":"够了！够了！漫画家什么的我再也不做了！","finish":true,"lastUpdate":20130227,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b97138f275fd560b1ce0.jpg"},{"name":"现实往往比少女漫画更加离奇","type":"耽美漫画","area":"日本漫画","des":"现实往往比少女漫画更加离奇漫画 ，心跳不已~易推倒汉子共度良宵的对象居然是（哔\u2014）工作恋爱不尽人意的他这段邂逅将带来怎样转变？欢迎在新动漫漫画网观看现实往往比少女漫画更加离奇漫画","finish":true,"lastUpdate":20141124,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b99538f275fd560b2160.jpg"},{"name":"铁道少女漫画","type":"少女漫画","area":"日本漫画","des":"在电车上行窃成癖的女高中生扒手，意外被卷入行窃对象的太太与小舅子间的私奔疑云之中！？即将出国的少女，在车站痴痴等著意中人\u2026\u2026被学妹告白的女子棒球队成员，在车站捡到了刚与情人分手的女性的手机，这份机缘将会如何演变？发生在铁道延线上的各种爱情故事，令人笑泪交织、心动不已\u2026一起踏上恋爱的旅程吧！","finish":true,"lastUpdate":20130803,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b9a838f275fd560b239a.jpg"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * total : 6
         * limit : 20
         * bookList : [{"name":"萌系少女漫画家","type":"少年漫画","area":"日本漫画","des":"萌系少女漫画家漫画 ，姬咲桃华－１６岁，是个内向又非常喜欢少女漫画的女高中生。明明想画的是少女漫画，却因为发生了偶然的意外而开始画起了萌系漫画。咦咦\u2026！？萌是什麽东西啊？？我搞不懂啦！而桃华所暗恋的同班同学五十岚臣又有著什麽样的秘密？不管是谈恋爱、钻研漫画还是追寻萌！一切都没有捷径，只能不断地摸索的迷航物语\u2026现在开幕！欢迎在新动漫漫画网观看萌系少女漫画家漫画","finish":false,"lastUpdate":20141114,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b87e38f275fd560ae949.jpg"},{"name":"莎梅少女漫画教室","type":"少年漫画","area":"日本漫画","des":"曾莎梅的少女漫画教程,喜欢画少女漫的值得看下(本漫画内容介绍由xindm.cn整理提供)","finish":true,"lastUpdate":20120725,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b8d838f275fd560b0566.jpg"},{"name":"少女漫画家之恋","type":"少女漫画","area":"日本漫画","des":"少女漫画家之恋漫画 ，少女漫画家与英俊编辑的故事欢迎在新动漫漫画网观看少女漫画家之恋漫画","finish":true,"lastUpdate":20141106,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b94638f275fd560b1739.jpg"},{"name":"少女漫画什么的最讨厌了","type":"少女漫画","area":"日本漫画","des":"够了！够了！漫画家什么的我再也不做了！","finish":true,"lastUpdate":20130227,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b97138f275fd560b1ce0.jpg"},{"name":"现实往往比少女漫画更加离奇","type":"耽美漫画","area":"日本漫画","des":"现实往往比少女漫画更加离奇漫画 ，心跳不已~易推倒汉子共度良宵的对象居然是（哔\u2014）工作恋爱不尽人意的他这段邂逅将带来怎样转变？欢迎在新动漫漫画网观看现实往往比少女漫画更加离奇漫画","finish":true,"lastUpdate":20141124,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b99538f275fd560b2160.jpg"},{"name":"铁道少女漫画","type":"少女漫画","area":"日本漫画","des":"在电车上行窃成癖的女高中生扒手，意外被卷入行窃对象的太太与小舅子间的私奔疑云之中！？即将出国的少女，在车站痴痴等著意中人\u2026\u2026被学妹告白的女子棒球队成员，在车站捡到了刚与情人分手的女性的手机，这份机缘将会如何演变？发生在铁道延线上的各种爱情故事，令人笑泪交织、心动不已\u2026一起踏上恋爱的旅程吧！","finish":true,"lastUpdate":20130803,"coverImg":"http://imgs.juheapi.com/comic_xin/5559b9a838f275fd560b239a.jpg"}]
         */

        private int total;
        private int limit;
        private List<BookListBean> bookList;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public List<BookListBean> getBookList() {
            return bookList;
        }

        public void setBookList(List<BookListBean> bookList) {
            this.bookList = bookList;
        }

        public static class BookListBean {
            /**
             * name : 萌系少女漫画家
             * type : 少年漫画
             * area : 日本漫画
             * des : 萌系少女漫画家漫画 ，姬咲桃华－１６岁，是个内向又非常喜欢少女漫画的女高中生。明明想画的是少女漫画，却因为发生了偶然的意外而开始画起了萌系漫画。咦咦…！？萌是什麽东西啊？？我搞不懂啦！而桃华所暗恋的同班同学五十岚臣又有著什麽样的秘密？不管是谈恋爱、钻研漫画还是追寻萌！一切都没有捷径，只能不断地摸索的迷航物语…现在开幕！欢迎在新动漫漫画网观看萌系少女漫画家漫画
             * finish : false
             * lastUpdate : 20141114
             * coverImg : http://imgs.juheapi.com/comic_xin/5559b87e38f275fd560ae949.jpg
             */

            private String name;
            private String type;
            private String area;
            private String des;
            private boolean finish;
            private int lastUpdate;
            private String coverImg;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getDes() {
                return des;
            }

            public void setDes(String des) {
                this.des = des;
            }

            public boolean isFinish() {
                return finish;
            }

            public void setFinish(boolean finish) {
                this.finish = finish;
            }

            public int getLastUpdate() {
                return lastUpdate;
            }

            public void setLastUpdate(int lastUpdate) {
                this.lastUpdate = lastUpdate;
            }

            public String getCoverImg() {
                return coverImg;
            }

            public void setCoverImg(String coverImg) {
                this.coverImg = coverImg;
            }
        }
    }
}
