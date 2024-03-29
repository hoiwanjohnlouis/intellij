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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.datatypes.MyIntType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  812
 *  ApplQueueMax
 *  int
 *  <p></p>
 *  Used to specify the maximum number of application messages
 *  that can be queued before a corrective action needs to take
 *  place to resolve the queuing issue.
 */
public class Tag812IntApplQueueMax extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyIntType dataValue;

    public final static int TESTA_INT_APPL_QUEUE_MAX
            = 812;
    public final static int TESTB_INT_APPL_QUEUE_MAX
            = 12;

    public Tag812IntApplQueueMax(MyIntType dataValue) {
        setFixType( FIX44.FIX812_INT_APPL_QUEUE_MAX );
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
        Tag812IntApplQueueMax tagData;

        tagData = new Tag812IntApplQueueMax(new MyIntType( TESTA_INT_APPL_QUEUE_MAX ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag812IntApplQueueMax(new MyIntType( TESTB_INT_APPL_QUEUE_MAX ) );
        System.out.println(tagData.toVerboseString());
    }
}
