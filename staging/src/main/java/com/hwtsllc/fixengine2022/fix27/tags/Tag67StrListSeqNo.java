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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  67
 *  ListSeqNo
 *  int
 *  Sequence of individual order within list
 *  (i.e. ListSeqNo of TotNoOrders (68), 2 of 25, 3 of 25,   . . . )
 */
public class Tag67StrListSeqNo extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyStringType dataValue;

    public final static String TESTA_STR_LIST_SEQ_NO = "567";  // same as tag34 TESTA_MSG_SEQ_NO
    public final static String TESTB_STR_LIST_SEQ_NO = "1482";  // same as tag34 TESTB_MSG_SEQ_NO

    public Tag67StrListSeqNo(MyStringType dataValue) {
        setFixType(FIX27.FIX67_STR_LIST_SEQ_NO);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
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
        Tag67StrListSeqNo tagData;

        tagData = new Tag67StrListSeqNo(new MyStringType(TESTA_STR_LIST_SEQ_NO) );
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag67StrListSeqNo(new MyStringType(TESTB_STR_LIST_SEQ_NO) );
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
