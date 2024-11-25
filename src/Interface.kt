class Interface {
}

interface  MyInterfaceListener {
    fun onTouch()
    fun onClick() {
        print("MyInterfaceListener : onlick")
    }
}

interface  MySecondInterface {
    fun onTouch(){
        print("MySecondInterface : onTouch")
    }
    fun onClick() {
        print("MySecondInterface : onlick")
    }
}

class MyButton : MyInterfaceListener, MySecondInterface {
    override fun onTouch() {
        super.onTouch()
    }

    override fun onClick() {
        super<MySecondInterface>.onClick()
    }
}