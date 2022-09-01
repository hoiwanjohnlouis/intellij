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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.datatypes.MySeqNumType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  369
 *  LastMsgSeqNumProcessed
 *  SeqNum
 *  <p></p>
 *  The last MsgSeqNum (34) value received by the FIX engine and processed by
 *  downstream application, such as trading engine or order routing system.
 *  <p></p>
 *  Can be specified on every message sent.
 *  <p></p>
 *  Useful for detecting a backlog with a counterparty.
 */
public class Tag369SeqLastMsgSeqNumProcessed extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MySeqNumType dataValue;

    public final static int TESTA_SEQ_LAST_MSG_SEQ_NUM_PROCESSED
            = 369;
    public final static int TESTB_SEQ_LAST_MSG_SEQ_NUM_PROCESSED
            = 69;

    public Tag369SeqLastMsgSeqNumProcessed(final MySeqNumType dataValue) {
        setFixType(FIX42.FIX369_SEQ_LAST_MSG_SEQ_NUM_PROCESSED);
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
        Tag369SeqLastMsgSeqNumProcessed tagData;

        tagData = new Tag369SeqLastMsgSeqNumProcessed(new MySeqNumType(TESTA_SEQ_LAST_MSG_SEQ_NUM_PROCESSED) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag369SeqLastMsgSeqNumProcessed(new MySeqNumType(TESTB_SEQ_LAST_MSG_SEQ_NUM_PROCESSED) );
        System.out.println(tagData.toVerboseString());
    }
}
