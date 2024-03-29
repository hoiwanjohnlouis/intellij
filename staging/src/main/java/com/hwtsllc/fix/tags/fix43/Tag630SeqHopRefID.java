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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.datatypes.MySeqNumType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  630
 *  HopRefID
 *  SeqNum
 *  <p></p>
 *  Reference identifier assigned by HopCompID (628) associated with the message sent.
 *  <p></p>
 *  It is recommended that this value be the MsgSeqNum (34) of the message sent by the third party.
 *  <p></p>
 *  Applicable when messages are communicated/re-distributed via third parties
 *  which function as service bureaus or "hubs".
 *  <p></p>
 *  Only applicable if OnBehalfOfCompID (115) is being used.
 */
public class Tag630SeqHopRefID extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MySeqNumType dataValue;

    public final static int TESTA_SEQ_HOP_REF_ID
            = 630;
    public final static int TESTB_SEQ_HOP_REF_ID
            = 36;

    public Tag630SeqHopRefID(final MySeqNumType dataValue) {
        setFixType(FIX43.FIX630_SEQ_HOP_REF_ID);
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
        Tag630SeqHopRefID tagData;

        tagData = new Tag630SeqHopRefID(new MySeqNumType(TESTA_SEQ_HOP_REF_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag630SeqHopRefID(new MySeqNumType(TESTB_SEQ_HOP_REF_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
