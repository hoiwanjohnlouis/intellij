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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class Tag34SntMsgSeqNum extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MySeqNumType dataValue;

    public final static int TESTA_SNT_MSG_SEQ_NO = 567;
    public final static int TESTB_SNT_MSG_SEQ_NO = 1482;

    public Tag34SntMsgSeqNum(MySeqNumType dataValue) {
        setFixType(FIX27.FIX34_SNT_MSG_SEQ_NUM);
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
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
        Tag34SntMsgSeqNum tagData;
        tagData = new Tag34SntMsgSeqNum(new MySeqNumType(TESTA_SNT_MSG_SEQ_NO) );
        System.out.println("initial values A");
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
        tagData = new Tag34SntMsgSeqNum(new MySeqNumType(TESTA_SNT_MSG_SEQ_NO) );
        System.out.println("initial values B");
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.getEnumName());
        System.out.println("ID:" + tagData.getID());
        System.out.println("Name:" + tagData.getName());
        System.out.println("Description:" + tagData.getDescription());
    }
}
