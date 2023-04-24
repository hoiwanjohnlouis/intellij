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

import com.hwtsllc.fixengine2022.datatypes.*;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  67
 *  ListSeqNo
 *  int
 *  <p></p>
 *  Sequence of individual order within list
 *  <p></p>
 *  (i.e. ListSeqNo of TotNoOrders (68), 2 of 25, 3 of 25,   . . . )
 */
public class Tag67SeqListSeqNo extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MySeqNumType dataValue;

    public final static int TESTA_SEQ_LIST_SEQ_NO
            = 567;  // same as tag34 TESTA_MSG_SEQ_NO
    public final static int TESTB_SEQ_LIST_SEQ_NO
            = 1482;  // same as tag34 TESTB_MSG_SEQ_NO

    public Tag67SeqListSeqNo( MySeqNumType dataValue) {
        setFixType(FIX27.FIX67_SEQ_LIST_SEQ_NO );
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
        System.out.println( new Tag67SeqListSeqNo(new MySeqNumType( TESTA_SEQ_LIST_SEQ_NO )).toVerboseString() );
        System.out.println( new Tag67SeqListSeqNo(new MySeqNumType( TESTB_SEQ_LIST_SEQ_NO )).toVerboseString() );
    }
}
