package org.mule.extension.openai.internal.types;

import org.mule.runtime.api.value.Value;
import org.mule.runtime.extension.api.values.ValueProvider;
import org.mule.runtime.extension.api.values.ValueResolvingException;
import org.mule.runtime.extension.api.values.ValueBuilder;

import java.util.Set;

public class ChatModelsValueProvider implements ValueProvider{

    @Override
    public Set<Value> resolve() throws ValueResolvingException {
        return ValueBuilder.getValuesFor("gpt-3.5-turbo", "gpt-3.5-turbo-0125");
    }
    
}
