(function()
{
	return function()
	{
		nexacro._setCSSMaps(
		{
			"Static" :
			{
				"self" :
				{
					"enabled" :
					{
						"font" : nexacro.FontObject("bold 16pt \"Arial\"")
					},
					"mouseover" :
					{
						"color" : nexacro.ColorObject("white")
					}
				}
			}
		}
		);

		var imgcache = nexacro._getImageCacheMaps();
		
	};
}
)();
