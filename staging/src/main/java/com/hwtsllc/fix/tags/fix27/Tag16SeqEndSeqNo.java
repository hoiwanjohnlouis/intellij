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

package com.hwtsllc.fix.tags.fix27;

import com.hwtsllc.fix.datatypes.FIX27;
import com.hwtsllc.fix.datatypes.FIX27Abstract;
import com.hwtsllc.fix.datatypes.MySeqNumType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  16
 *  EndSeqNo
 *  SeqNum
 *  <p></p>
 *  Message sequence number of last message in range to be resent.
 *  <p></p>
 *  If request is for a single message BeginSeqNo (7) = EndSeqNo.
 *  <p></p>
 *  If request is for all messages subsequent from a particular message,
 *  <p></p>
 *  EndSeqNo = "0" (representing infinity).
 */
public class Tag16SeqEndSeqNo extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MySeqNumType dataValue;

    public final static int TESTA_SEQ_END_SEQ_NO
            = 256;
    public final static int TESTB_SEQ_END_SEQ_NO
            = 512;

    public Tag16SeqEndSeqNo(MySeqNumType dataValue) {
        setFixType(FIX27.FIX16_SEQ_END_SEQ_NO);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(this.dataValue.toString());
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
        return this.dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag16SeqEndSeqNo(new MySeqNumType(TESTA_SEQ_END_SEQ_NO)).toVerboseString() );
        System.out.println( new Tag16SeqEndSeqNo(new MySeqNumType(TESTB_SEQ_END_SEQ_NO)).toVerboseString() );
    }
}
