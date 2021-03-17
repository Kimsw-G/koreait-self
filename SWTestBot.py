import discord
from discord.ext import commands
import asyncio
import datetime
import pytz
import random
import time

intents = discord.Intents.default()
intents.members = True
client = discord.Client(intents=intents)

@client.event
async def on_ready():
    print("디스코드봇 이름:" + client.user.name)
    print("디스코드봇 ID:" + str(client.user.id))
    print("디스코드봇 버전:" + str(discord.__version__))
    print('------')
    await client.change_presence(status=discord.Status.online, activity=discord.Game("작업"))

@client.event
async def on_message(message):
    channel = message.channel
    content = message.content 
    author = message.author
    owner = message.guild.owner
    
    if message.content.startswith("!주인"):
        await message.channel.send(owner)
        await message.channel.send(author)
        if owner==author:
            await message.channel.send("{}는 어드민입니다.".format(author))
        else:
            await message.channel.send("{}는 어드민이 아닙니다.".format(author))
    
    if message.content.startswith("!도움"):
        embed = discord.Embed(title="도움말" , description="dd")
        embed.add_field(name="!안녕",value="테스트용" ,inline=False)
        embed.add_field(name="!정리",value="!정리 : 봇 정리 \n !정리 @멘션 : 특정 사용자 대화 정리" ,inline=False)
        embed.add_field(name="!라인",value="!라인 [이름] [이름] [이름] [이름] [이름] : 라인 랜덤 배정" ,inline=False)
        embed.set_footer(text="만든이 성욱#0888")
        await message.channel.send(embed=embed)

    if message.content.startswith("!안녕"):
        await message.channel.send("안녕!")

    if message.content.startswith('!정리'):
        if owner == author:
            if len(message.mentions)==0:
                await channel.purge(limit=100, check=lambda x:x.author.id == client.user.id)
            else:
                mentioned = message.mentions[0]
                await channel.purge(limit=100, check=lambda x:x.author.id == mentioned.id)
        else:
            if len(message.mentions)==1 and author == message.mentions[0]:
                mentioned = message.mentions[0]
                await channel.purge(limit=100, check=lambda x:x.author.id == mentioned.id)
            else:
                await message.channel.send("권한이 없습니다.")

    if message.content.startswith("!라인"):
        if len(message.content.split(" ")) == 1:
            embed = discord.Embed(title="이름을 입력하세요" ,description="")
            embed.add_field(name="이름 없음",value="USAGE:!pos [이름]")
            await message.channel.send("Error : incorrect USAGE ", embed = embed)
        else:
            embed = discord.Embed(title="라인 결과" ,description="")
            lines = ["Top","Jungle","Mid","ADC","Spt"]
            names = []
            num  = 0
            for i in range(1,6):
                names.append("".join(message.content.split(" ")[i:i+1]))
            random.shuffle(names)
            for line in lines:
                num = num + 1
                embed.add_field(name=line, value=names[num-1],inline=False)
            await message.channel.send(embed=embed)




client.run('ODIxMTk0ODY3MTM2Mzk3MzMy.YFALUQ.7Wewvo58iovX_0Bm9z1QaG_x8KY')
