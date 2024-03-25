Modded recipes work the same way as regular minecraft recipes.

For example, here is a modded recipe in json:
```
{
  "type": "minecraft:crafting_shapeless",
  "category": "building",
  "ingredients": [
    {
      "item": "tutorialmod:ruby_block"
    }
  ],
  "result": {
    "item": "tutorialmod:ruby",
    "count": 9
  }
}
```

And here is a vanilla recipe in json:

```
{
  "type": "minecraft:crafting_shapeless",
  "category": "misc",
  "group": "bonemeal",
  "ingredients": [
    {
      "item": "minecraft:bone"
    }
  ],
  "result": {
    "item": "minecraft:bone_meal",
    "count": 3
  }
}
```

As you can see, they are identical, which means it is easy to base your own recipes off of already existing recipes.

"type" refers to the method in which the item is made.

There are a variety of different types, such as:
- "crafting_shapeless"
- "crafting_shaped"
- "blasting"
- "smelting"

and many more.

Pre-existing minecraft recipes can be found the directory
```
net\minecraft\minecraft-merged-4060f3af86\1.20.1-net.fabricmc.yarn.1_20_1.1.20.1+build.10-v2\minecraft-merged-4060f3af86-1.20.1-net.fabricmc.yarn.1_20_1.1.20.1+build.10-v2.jar!\data\minecraft\recipes
```

I recommend that you look for the data and assets folders and bookmark them in your IDE for easier access