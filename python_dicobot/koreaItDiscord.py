import discord
import asyncio
import datetime
import pytz

client = discord.Client()

#embed=discord.Embed(title="Embed", description="Embed 내용.", color=0x00aaaa)
#embed=discord.Embed(title="Embed", description="Embed 내용.",timestamp=datetime.datetime.now() , color=0x00aaaa)
embed=discord.Embed(title="Embed", description="Embed 내용.",timestamp=datetime.datetime.now(pytz.timezone('UTC')) , color=0x00aaaa)
#embed 설정
#embed timestamp 설정시, UTC+0으로 맞춘다
#(cmd창)
#py -3 -m pip install pytz

@client.event
async def on_ready(): 
    print("디스코드 봇 로그인이 완료되었습니다.")
    print("디스코드봇 이름:" + client.user.name)
    print("디스코드봇 ID:" + str(client.user.id))
    print("디스코드봇 버전:" + str(discord.__version__))
    print('------')
    await client.change_presence(status=discord.Status.online, activity=discord.Game("공부"))
 
@client.event
async def on_message(message): 
    content = message.content 
    guild = message.guild 
    author = message.author 
    channel = message.channel 
    if content.startswith("!test"): 
        await message.channel.send("test성공") 
    if content == "!ping": 
        await message.channel.send("Pong!")
    if content == "!time":
        embed.set_author(name=author, icon_url=message.author.avatar_url)
        embed.add_field(name="field1", value="value1", inline=False)
        embed.add_field(name="field2", value="value2", inline=True)
        embed.set_footer(text="footer")
        await message.channel.send(embed=embed)
    if message.content.startswith("!반응"):
        msg = await message.channel.send("내용")
        await msg.add_reaction("\U00000030\U0000FE0F\U000020E3")
        return
 
client.run('dd')