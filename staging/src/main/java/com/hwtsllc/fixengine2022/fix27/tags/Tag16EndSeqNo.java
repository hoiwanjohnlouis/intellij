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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag16EndSeqNo extends TagTypeAbstract {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public Tag16EndSeqNo(String dataValue) {
        setFixType(FIXType.FIX16_END_SEQ_NO);
        setDataValue(dataValue);
    }

    /**
     *
     * @param args          no used
     */
    public static void main(String[] args) {
        Tag16EndSeqNo tag16EndSeqNo = new Tag16EndSeqNo("987654321");
        System.out.println(tag16EndSeqNo);
        System.out.println(tag16EndSeqNo.toLogStringVerbose());
        System.out.println(tag16EndSeqNo.toFixTagValuePairString());
    }
}
