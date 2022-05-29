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
import com.hwtsllc.fixengine2022.datatypes.MyFloatType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  231
 *  ContractMultiplier
 *  float
 *  <p>
 *  Specifies the ratio or multiply factor to convert from "nominal" units
 *  (e.g. contracts) to total units (e.g. shares) (e.g. 1.0, 100, 1000, etc).
 *  <p>
 *  Applicable For Fixed Income, Convertible Bonds, Derivatives, etc.
 *  <p></p>
 *  In general quantities for all classes should be expressed in the basic
 *  unit of the instrument, e.g. shares for equities, norminal or par amount for bonds,
 *  currency for foreign exchange.
 *  <p></p>
 *  When quantity is expressed in contracts, e.g. financing transactions and bond trade
 *  reporting, the ContractMutliplier should contain the number of units in one contract
 *  and can be omitted if the multiplier is the default amount for the instrument,
 *  <p></p>
 *  i.e. 1,000 par of bonds, 1,000,000 par for financing transactions.
 */
public class Tag231FloContractMultiplier extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyFloatType dataValue;

    public final static float TESTA_FLO_CONTRACT_MULTIPLIER
            = 0.231F;
    public final static float TESTB_FLO_CONTRACT_MULTIPLIER
            = 0.0231F;

    public Tag231FloContractMultiplier(MyFloatType dataValue) {
        setFixType(FIX42.FIX231_FLO_CONTRACT_MULTIPLIER);
        this.dataValue = dataValue;
    }

    public float getDataValue() {
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
        Tag231FloContractMultiplier tagData;

        tagData = new Tag231FloContractMultiplier(new MyFloatType(TESTA_FLO_CONTRACT_MULTIPLIER) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag231FloContractMultiplier(new MyFloatType(TESTB_FLO_CONTRACT_MULTIPLIER) );
        System.out.println(tagData.toVerboseString());
    }
}
