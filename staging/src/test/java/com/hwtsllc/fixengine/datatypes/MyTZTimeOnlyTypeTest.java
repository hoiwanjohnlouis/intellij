package com.hwtsllc.fixengine.datatypes;

import com.hwtsllc.fixengine2022.fix41.tags.Tag142StrSenderLocationID;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTZTimeOnlyTypeTest {
    MyTZTimeOnlyType dataType;
    String [] TestArray = {
            MyTZTimeOnlyType.TESTA_MY_TZ_TIME_ONLY_TYPE,
            MyTZTimeOnlyType.TESTB_MY_TZ_TIME_ONLY_TYPE
    };

    @Test
    void TZTimeOnlyTypeTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            dataType = new MyTZTimeOnlyType( oneElement );
            assertEquals( oneElement, dataType.toString() );
            assertNotEquals( MyTestValues.JUNK_TZT_DATA_VALUE, dataType.toString());
        }
    }
    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            dataType = new MyTZTimeOnlyType( oneElement );
            System.out.println( dataType.toVerboseString() );
        }
    }
}