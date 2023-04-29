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
import com.hwtsllc.fix.datatypes.MyPercentageType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  849
 *  ParticipationRate
 *  Percentage
 *  <p></p>
 *  Deprecated in FIX.5.0
 *  <p></p>
 *  For a TargetStrategy=Participate order specifies the target particpation rate.
 *  <p></p>
 *  For other order types this is a volume limit
 *  (i.e. do not be more than this percent of the market volume)
 */
public class Tag849PctParticipationRate extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyPercentageType dataValue;

    public final static double TESTA_PCT_PARTICIPATION_RATE
            = 0.849D;
    public final static double TESTB_PCT_PARTICIPATION_RATE
            = 0.49D;

    public Tag849PctParticipationRate(MyPercentageType dataValue) {
        setFixType( FIX44.FIX849_PCT_PARTICIPATION_RATE );
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
        Tag849PctParticipationRate tagData;

        tagData = new Tag849PctParticipationRate(new MyPercentageType( TESTA_PCT_PARTICIPATION_RATE ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag849PctParticipationRate(new MyPercentageType( TESTB_PCT_PARTICIPATION_RATE ) );
        System.out.println(tagData.toVerboseString());
    }
}
