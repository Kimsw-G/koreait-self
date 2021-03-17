import discord
from discord.ext import commands


# bot_activity = discord.Activity("멍때리기")
bot = commands.Bot(command_prefix='!')
# bot = commands.Bot(status=discord.Status.online)


@bot.command()
async def 안녕(ctx):
    await ctx.send("hello")

@bot.command()
async def 어드민(ctx):
    await ctx.send(ctx.guild.owner)

@bot.command()
async def 라인(ctx):
    await print(ctx.content)
    await ctx.send(ctx.content)

bot.run('ODIxMTk0ODY3MTM2Mzk3MzMy.YFALUQ.0f-eiEFZR7XJU_mzCh1Y5wqBjUQ')    