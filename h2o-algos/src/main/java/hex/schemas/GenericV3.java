package hex.schemas;

import hex.generic.Generic;
import hex.generic.GenericModelParameters;
import water.api.API;
import water.api.schemas3.KeyV3;
import water.api.schemas3.ModelParametersSchemaV3;

public class GenericV3 extends ModelBuilderSchema<Generic, GenericV3, GenericV3.GenericParametersV3> {

    public static final class GenericParametersV3 extends ModelParametersSchemaV3<GenericModelParameters, GenericParametersV3> {
        public static final String[] fields = new String[]{
                "model_id",
                "model_key"
        };

        @API(direction = API.Direction.INOUT, level = API.Level.critical, help = "Key to the self-contained model archive already uploaded to H2O.")
        public KeyV3.FrameKeyV3 model_key;
    }
    
    
}
