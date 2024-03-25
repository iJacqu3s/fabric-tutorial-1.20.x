Here is an example of how to add a new block.

```
public static final Block RUBY_BLOCK = registerBlock("ruby_block",
    new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
```
registerBlock: This private static method registers a block and its item form. It takes a String name and a Block instance, registers the block item, and then registers the block itself.

registerBlockItem: This private static method registers the block as an item so it can be held in the inventory