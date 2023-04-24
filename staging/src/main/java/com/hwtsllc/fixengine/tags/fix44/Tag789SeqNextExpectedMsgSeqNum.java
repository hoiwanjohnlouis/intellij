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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.datatypes.MySeqNumType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  789
 *  NextExpectedMsgSeqNum
 *  SeqNum
 *  <p></p>
 *  Next expected MsgSeqNum value to be received.
 */
public class Tag789SeqNextExpectedMsgSeqNum extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MySeqNumType dataValue;

    public final static int TESTA_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM
            = 789;
    public final static int TESTB_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM
            = 89;

    public Tag789SeqNextExpectedMsgSeqNum(final MySeqNumType dataValue) {
        setFixType( FIX44.FIX789_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM );
        this.dataValue = dataValue;
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
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag789SeqNextExpectedMsgSeqNum tagData;

        tagData = new Tag789SeqNextExpectedMsgSeqNum(new MySeqNumType( TESTA_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag789SeqNextExpectedMsgSeqNum(new MySeqNumType( TESTB_SEQ_NEXT_EXPECTED_MSG_SEQ_NUM ) );
        System.out.println(tagData.toVerboseString());
    }
}
