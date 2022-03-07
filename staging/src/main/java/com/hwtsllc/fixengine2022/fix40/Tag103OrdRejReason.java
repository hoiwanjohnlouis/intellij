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

package com.hwtsllc.fixengine2022.fix40;

import com.hwtsllc.fixengine2022.datatypes.Enum103OrdRejReason;
import com.hwtsllc.fixengine2022.datatypes.Enum4AdvSide;
import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag103OrdRejReason extends TagTypeAbstract {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private Enum103OrdRejReason enum103OrdRejReason;

    public Tag103OrdRejReason(Enum103OrdRejReason enum103OrdRejReason) {
        setFixType(FIXType.FIX103_ORD_REJ_REASON);
        setDataValue(enum103OrdRejReason.getAction());
        this.enum103OrdRejReason = enum103OrdRejReason;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag103OrdRejReason tag103OrdRejReason = new Tag103OrdRejReason(Enum103OrdRejReason.OTHER);
        System.out.println(Enum103OrdRejReason.OTHER);
        System.out.println(tag103OrdRejReason);
        System.out.println(tag103OrdRejReason.toFixTagValuePairString());
    }
}
