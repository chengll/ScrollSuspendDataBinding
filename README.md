# ScrollSuspendDataBinding这几天项目接触了DataBinding这个数据绑定框架觉得挺好使用的，因此在将前几天scrollView的悬停和DataBinding的案例结合做了
一个简单简单的demo,我的数据结构是：在TeacherInfoBean中都有，有需要的小伙伴可以看看，通过DataBinding实现数据的绑定，图片的绑定以及和List的绑定等等，
案例比较简单，但是对于初了解该框架的我来说还是值得回顾一次。
 首先类的结构是嵌套的，注意对获取的字段一定要绑定，添加@Bindleble绑定，同时要继承BaseObservable类，对数据要及时的更改；
 其次，对于图片的加载方法在上一次的demo中已经写过了；最后一个遗憾问题就是DataBinding和Include布局包裹布局时有一个bug，今天暂时就到这里吧，有空了继续写
 
