## Items

Item json files that go into the item folder look like this:

```
{
"parent": "item/generated",
"textures": {
"layer0": "tutorialmod:item/ruby"
}
}
```

## Blocks

Block json files that go into the block and item folders look like this:

```
{
  "parent": "block/cube_all",
  "textures": {
    "all": "tutorialmod:block/raw_ruby_block"
  }
}
```


Block json files for block states look like this:

```
{
  "variants": {
    "": {
      "model": "tutorialmod:block/raw_ruby_block"
    }
  }
}
```

To make the block model visible both in the world and in the inventory,
the block's json file must be in both the models/block and models/item folders