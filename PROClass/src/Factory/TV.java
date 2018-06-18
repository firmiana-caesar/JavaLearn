package Factory;

import java.io.*;

abstract class TV {
    public TV(){}
}


class HaierTV extends TV{
    public HaierTV() {
        System.out.println("Haier TV");
    }
}

class HisenseTV extends TV{
    public HisenseTV(){
        System.out.println("Hisense TV");
    }
}