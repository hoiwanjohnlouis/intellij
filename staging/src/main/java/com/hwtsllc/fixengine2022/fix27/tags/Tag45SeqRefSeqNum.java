/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.datatypes.MySeqNumType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  45
 *  RefSeqNum
 *  SeqNum
 *  Reference message sequence number
 */
public class Tag45SeqRefSeqNum extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MySeqNumType dataValue;

    public final static int TESTA_SEQ_REF_SEQ_NO = 567;  // same as tag34 TESTA_MSG_SEQ_NO
    public final static int TESTB_SEQ_REF_SEQ_NO = 1482;  // same as tag34 TESTB_MSG_SEQ_NO

    public Tag45SeqRefSeqNum(MySeqNumType dataValue) {
        setFixType(FIX27.FIX45_SEQ_REF_SEQ_NUM);
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        dumpDataValues( new Tag45SeqRefSeqNum(new MySeqNumType(TESTA_SEQ_REF_SEQ_NO)) );
        dumpDataValues( new Tag45SeqRefSeqNum(new MySeqNumType(TESTB_SEQ_REF_SEQ_NO)) );
    }
    /**
     *
     * @param tagData   Tag45SeqRefSeqNum
     */
    static void dumpDataValues(Tag45SeqRefSeqNum tagData) {
        System.out.println("---------- Start Tag45SeqRefSeqNum MySeqNumType ----------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("---------- End Tag45SeqRefSeqNum MySeqNumType ----------");
    }
}
