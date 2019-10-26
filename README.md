# Step Height Entity Attribute
Library for adding step height as an entity attribute modifier that can be applied to held items, armor, trinkets, etc.

## Usage
To use this library in your mods, add the following lines to your ``build.gradle``

```
repositories {
	maven {
		url = "https://jitpack.io"
	}
}
dependencies {
	modImplementation "com.github.emilyploszaj:step-height-entity-attribute:v1.0.0"
	include "com.github.emilyploszaj:step-height-entity-attribute:v1.0.0"
}
```

## Attributes
Step height is additive to the base step height of an entity (0.6 for players, 1.0 for horses, etc.) and will increase how many blocks the entity can scale without jumping.